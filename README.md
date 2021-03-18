# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 20-09-as-principais-abordagens-para-manter-a-base-de-codigo-de-apis-versionadas
git add .
git commit -m "As principais abordagens para manter a base de código de APIs versionadas"
git push origin 20-09-as-principais-abordagens-para-manter-a-base-de-codigo-de-apis-versionadas

git checkout master
git merge --no-ff 20-09-as-principais-abordagens-para-manter-a-base-de-codigo-de-apis-versionadas
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```