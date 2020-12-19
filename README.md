# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 07-02-conhecendo-o-hikari
git add .
git commit -m "Conhecendo o Hikari: a solução padrão de pool de conexões no Spring Boot"
git push origin 07-02-conhecendo-o-hikari

git checkout master
git merge --no-ff 07-02-conhecendo-o-hikari
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