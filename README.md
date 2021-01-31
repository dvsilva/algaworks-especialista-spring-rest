# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 14-03-validando-tamanho-maximo-do-arquivo
git add .
git commit -m "Validando o tamanho máximo do arquivo"
git push origin 14-03-validando-tamanho-maximo-do-arquivo

git checkout master
git merge --no-ff 14-03-validando-tamanho-maximo-do-arquivo
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